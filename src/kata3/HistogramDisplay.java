package kata3;

import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public final class HistogramDisplay extends ApplicationFrame {
    
    public HistogramDisplay() {
        super("HISTOGRAMA");
        setContentPane(createPanel());
        pack();
    }
    
    private JPanel createPanel() {
        ChartPanel panel = new ChartPanel(createChart(createDataset()));
        panel.setPreferredSize(new Dimension(500,400));
        return panel;
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataset) {
        JFreeChart jfc = 
                ChartFactory.createBarChart(
                "JFreeChart",
                "Dominios email",
                "Nº email",
                dataset, 
                PlotOrientation.VERTICAL,
                false,
                rootPaneCheckingEnabled,
                rootPaneCheckingEnabled);
        return jfc;
    }
    
    private DefaultCategoryDataset createDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(15, "", "ulpgc.es");
        dataset.addValue(8,"","ull.es");
        dataset.addValue(2,"","hotmail.com");
        dataset.addValue(4, "", "elpais.es");
        dataset.addValue(6, "", "yahoo.es");
        return dataset;
    }
    
    public void excute() {
        setVisible(true);
    }   
}