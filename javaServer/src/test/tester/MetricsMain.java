package tester;

import com.codahale.metrics.ConsoleReporter;
import com.codahale.metrics.Gauge;
import com.codahale.metrics.MetricRegistry;

import java.util.concurrent.TimeUnit;

/**
 * Created by pang on 2017/7/30.
 */
public class MetricsMain {

    public static void main(String args[]) throws InterruptedException{
        MetricRegistry registry = new MetricRegistry();

        TestGauge<Long> responseTime = new TestGauge<>();

        registry.register("testGauge", responseTime);

        responseTime.setValue(20L);

        ConsoleReporter reporter = ConsoleReporter.forRegistry(registry).build();

        reporter.start(1, TimeUnit.SECONDS);

        Thread.sleep(3000);
    }

    public static class TestGauge<T> implements Gauge {

        private T value;

        @Override
        public Object getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }
    }

}
