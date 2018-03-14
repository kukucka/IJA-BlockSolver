package cz.blocksolver.backend.block;

import cz.blocksolver.backend.block.goniometric.ArcsinusOperation;
import cz.blocksolver.backend.block.goniometric.SinusOperation;
import cz.blocksolver.backend.port.InputPort;
import cz.blocksolver.backend.port.OutputPort;
import cz.blocksolver.backend.port.PortType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class GoniometricBlockTest {

    public GoniometricBlock gBlock;
    @Before
    public void setUp() {
        gBlock = new GoniometricBlock("Goniometricky blok 1", 45, 65, 100, 50, SinusOperation.getInstance());

    }

    @Test
    public void testSinusDegreeFunctionality(){
        InputPort a = gBlock.getInputPort(1);
        a.setValue(180.0);
        a.setType(PortType.DEGREE);
        gBlock.executeBlock();
        OutputPort b = gBlock.getOutputPort();
        Assert.assertEquals(new Double(0.0), b.getValue());
    }

    @Test
    public void testSinusRadianFunctionality(){
        InputPort a = gBlock.getInputPort(1);
        a.setValue(1.5);
        a.setType(PortType.RADIAN);
        gBlock.executeBlock();
        OutputPort b = gBlock.getOutputPort();
        Assert.assertEquals(new Double(0.99749), b.getValue());
    }
    @Ignore
    @Test
    public void testChangeOperationToAsin(){
        gBlock.changeOperation(ArcsinusOperation.getInstance());
        InputPort a = gBlock.getInputPort(1);
        a.setValue(4.5);
        a.setType(PortType.NUMBER);
        gBlock.executeBlock();
        OutputPort b = gBlock.getOutputPort();
        Assert.assertEquals(new Double(0.5235), b.getValue());
    }

}