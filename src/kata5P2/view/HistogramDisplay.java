package kata5P2.view;

import kata5P2.model.Histogram;
import java.awt.Container;
import javax.swing.JPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;
import java.awt.Dimension;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.plot.PlotOrientation;

public class HistogramDisplay extends ApplicationFrame {

    private final Histogram<String> histogram;
    
    public HistogramDisplay(Histogram<String> histogram) {
        super("Histograma");
        this.histogram = histogram;
        setContentPane(createPanel());
        pack(); //para que la ventana coja el tamaño adecuado.
    }

    public void execute() {
        setVisible(true);
    }

    private JPanel createPanel() {
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        chartPanel.setPreferredSize(new Dimension(500,400));
        return chartPanel;
    }

    private JFreeChart createChart(DefaultCategoryDataset Dataset) {
        JFreeChart chart = ChartFactory.createBarChart(
                "Histograma de emails", 
                "dominios de emails", 
                "nº de emails recibidos", 
                Dataset, 
                PlotOrientation.VERTICAL, 
                false, 
                rootPaneCheckingEnabled, 
                rootPaneCheckingEnabled);
        return chart;
    }


    private DefaultCategoryDataset createDataset() {
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        for (String key : histogram.keySet()) {
            dataSet.addValue(histogram.get(key), "", key);
        }
        return dataSet;
    }

    
    
}

