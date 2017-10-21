package kata3;

public class Kata3 {
    
    public static void main(String[] args) {
        Histogram histogram = new Histogram();
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ull.es");
        histogram.increment("yahoo.es");
        histogram.increment("gabri.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("elPais.es");
        histogram.increment("elPais.es");
        histogram.increment("ulpgc.es");
        histogram.increment("elPais.es");
        histogram.increment("ulpgc.es");
        new HistogramDisplay(histogram).excute();
    }
}
