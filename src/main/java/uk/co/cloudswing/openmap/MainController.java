package uk.co.cloudswing.openmap;

import java.awt.Button;
import java.util.Properties;
import java.util.ResourceBundle;

import javax.swing.SwingUtilities;

import com.bbn.openmap.gui.BasicMapPanel;
import com.bbn.openmap.layer.shape.ShapeLayer;

import javafx.embed.swing.SwingNode;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class MainController {

    private final String javafxVersion = System.getProperty("javafx.version");

    @FXML
    private Label label;
    
    @FXML
    private VBox form;

    @FXML
    private ResourceBundle resources;

    public void initialize() {
        label.setText(String.format(resources.getString("label.text"), "JavaFX", javafxVersion));
        
        SwingNode swingNode = new SwingNode();
Button b;
        createSwingContent(swingNode);

        form.getChildren().add(swingNode);
    }

    private void createSwingContent(final SwingNode swingNode) {
        SwingUtilities.invokeLater(() -> 
        	swingNode.setContent(createMap()));
    }
    
    // this is copied from SimpleMap.main
    private BasicMapPanel createMap() {
		BasicMapPanel mapPanel = new BasicMapPanel();

		// Create a ShapeLayer to show world political boundaries.
		// Set the properties of the layer. This assumes that the
		// "data" directory containing the files "dcwpo-browse.shp"
		// and "dcwpo-browse.ssx" are in a path specified in the
		// CLASSPATH variable. These files are distributed with
		// OpenMap and reside in the toplevel "share" subdirectory.
		ShapeLayer shapeLayer = new ShapeLayer();
		Properties shapeLayerProps = new Properties();
		shapeLayerProps.put("prettyName", "Political Solid");
		shapeLayerProps.put("lineColor", "000000");
		shapeLayerProps.put("fillColor", "BDDE83");
		shapeLayerProps.put("shapeFile", "data/shape/dcwpo-browse.shp");
		shapeLayerProps.put("spatialIndex", "data/shape/dcwpo-browse.ssx");
		shapeLayer.setProperties(shapeLayerProps);

		// Add the political layer to the map
		mapPanel.getMapBean().add(shapeLayer);

		return mapPanel;
    }
}
