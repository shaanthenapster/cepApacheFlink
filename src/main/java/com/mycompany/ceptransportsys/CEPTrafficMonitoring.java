/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ceptransportsys;

import org.apache.flink.api.common.typeinfo.TypeInformation;
import org.apache.flink.api.java.DataSet;
import org.apache.flink.api.java.ExecutionEnvironment;
import org.apache.flink.api.java.operators.DataSource;
import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.cep.CEP;
import org.apache.flink.cep.PatternFlatSelectFunction;
import org.apache.flink.cep.PatternStream;
import org.apache.flink.cep.pattern.Pattern;
import org.apache.flink.cep.pattern.conditions.IterativeCondition;
import org.apache.flink.streaming.api.TimeCharacteristic;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.api.functions.IngestionTimeExtractor;
import org.apache.flink.streaming.api.windowing.time.Time;
import org.apache.flink.util.Collector;
import com.mycompany.ceptransportsys.source.MonitoringTrafficEventSource;
import com.mycompany.ceptransportsys.MonitoringTrafficEvent;
import com.mycompany.ceptransportsys.TrafficEvent;
import com.mycompany.ceptransportsys.TrafficAlert;
import scala.tools.ant.sabbus.Use;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

import static org.apache.flink.streaming.api.TimeCharacteristic.EventTime;

/**
 *
 * @author bisht
 */
public class CEPTrafficMonitoring {

    private static final double TRAFFIC_THRESHOLD = 100;
    private static final int MAX_EXT_ID = 10;
    private static final long PAUSE = 100;
    private static final double TRAFFIC_RATIO = 0.5;
    private static final double POWER_STD = 10;
    private static final double POWER_MEAN = 100;
    private static final double TRAFFIC_STD = 20;
    private static final double TRAFFIC_MEAN = 80;

    public static void main(String[] args) throws Exception {
        ExecutionEnvironment env = ExecutionEnvironment.getExecutionEnvironment();

        env.setParallelism(1);

//
//        DataStream<> inputEventStream = env
//                .readTextFile();
//



//        System.out.println(inputEventStream.broadcast().iterate().toString());
//        Use ingestiontime => TimeCharacteristic == EventTime + IngestionTimeExtractor


//
//
        final String csvfileDestination = "/home/sanub/Desktop/cep/ceptransportsys/data/trafficData158415.csv";
//
//        DataStream<MonitoringTrafficEvent> inputEventStream = env
//                .addSource(new MonitoringTrafficEventSource(csvfileDestination
//                        )
//                ).assignTimestampsAndWatermarks(new IngestionTimeExtractor<>());
//
//


        DataSet<Tuple2<Integer , Integer >>  csvinput = env.readCsvFile("/home/sanub/Desktop/cep/ceptransportsys/data/trafficData158415.csv")
                .includeFields("000100100")
                .types(Integer.class , Integer.class);

        csvinput.print();



        //System.out.println(traffic.writeAsText());


        //////////////////////////////////  Service Logic ////////////////////////////////////////

//
//        // Warning pattern: Two consecutive traffic events whose traffic is higher than the given threshold
//        // appearing within a time interval of 10 seconds
//        Pattern<MonitoringTrafficEvent, ?> warningPattern = Pattern.<MonitoringTrafficEvent>begin("first")
//                .subtype(TrafficEvent.class)
//                .where(new IterativeCondition<TrafficEvent>() {
//                    private static final long serialVersionUID = -6301755149429716724L;
//
//                    @Override
//                    public boolean filter(TrafficEvent value, Context<TrafficEvent> ctx) throws Exception {
//                        return value.getTraffic() >= TRAFFIC_THRESHOLD;
//                    }
//                })
//                .next("second")
//                .subtype(TrafficEvent.class)
//                .where(new IterativeCondition<TrafficEvent>() {
//                    private static final long serialVersionUID = 2392863109523984059L;
//
//                    @Override
//                    public boolean filter(TrafficEvent value, Context<TrafficEvent> ctx) throws Exception {
//                        return value.getTraffic() >= TRAFFIC_THRESHOLD;
//                    }
//                })
//                .within(Time.seconds(10));
//
//        // Create a pattern stream from our warning pattern
//        PatternStream<MonitoringTrafficEvent> trafficPatternStream = CEP.pattern(new DataStream<MonitoringTrafficEvent>().inputEventStream.keyBy("extID")
//                , warningPattern);
//
//        // Generate traffic warnings for each matched warning pattern
//        DataStream<TrafficWarning> warnings = trafficPatternStream.select(
//                (Map<String, List<MonitoringTrafficEvent>> pattern) -> {
//                    TrafficEvent first = (TrafficEvent) pattern.get("first").get(0);
//                    TrafficEvent second = (TrafficEvent) pattern.get("second").get(0);
//
//                    return new TrafficWarning(first.getextID(), (first.getTraffic() + second.getTraffic()) / 2);
//                }
//        );
//
//        // Alert pattern: Two consecutive traffic warnings appearing within a time interval of 20 seconds
//        Pattern<TrafficWarning, ?> alertPattern = Pattern.<TrafficWarning>begin("first")
//                .next("second")
//                .within(Time.seconds(20));
//
//        System.out.println("hello world");
//
//        // Create a pattern stream from our alert pattern
//        PatternStream<TrafficWarning> alertPatternStream = CEP.pattern(
//                warnings.keyBy("extID"),
//                alertPattern);
//
////         Generate a traffic alert only if the second traffic warning's average traffic is higher than
////         first warning's traffic
//        DataStream<TrafficAlert> alerts = alertPatternStream.flatSelect(
//                (Map<String, List<TrafficWarning>> pattern, Collector<TrafficAlert> out) -> {
//                    TrafficWarning first = pattern.get("first").get(0);
//                    TrafficWarning second = pattern.get("second").get(0);
//
//                    if (first.getAverageTraffic() < second.getAverageTraffic()) {
//                        out.collect(new TrafficAlert(first.getextID()));
//                    }
//                },
//                TypeInformation.of(TrafficAlert.class));
//
//        // Print the warning and alert events to stdout
//        warnings.print();
//        alerts.print();
//
//        env.execute("CEP monitoring job");
//    }
//    }
    }
}