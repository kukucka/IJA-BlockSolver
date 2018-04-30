package cz.blocksolver.backend.port;

import java.util.Objects;

public class InputPort extends Port {
    private OutputPort outputPort;
    private Integer index;
    private Boolean valueSet;
    private Boolean connectedToOutputPort;

    public InputPort(PortType type, Double value, Integer index) {
        super(type, value);
        this.index = index;
        this.valueSet = false;
        this.connectedToOutputPort = false;
    }

    public Boolean getValueSet() {
        return valueSet;
    }

    public void setValueSet(Boolean valueSet) {
        this.valueSet = valueSet;
    }

    public Boolean getConnectedToOutputPort() {
        return connectedToOutputPort;
    }

    public void setConnectedToOutputPort(Boolean connectedToOutputPort) {
        this.connectedToOutputPort = connectedToOutputPort;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public OutputPort getOutputPort() {
        return outputPort;
    }

    public void setOutputPort(OutputPort outputPort) {
        this.outputPort = outputPort;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InputPort inputPort = (InputPort) o;
        return Objects.equals(this.outputPort, inputPort.outputPort) &&
                Objects.equals(this.index, inputPort.index) &&
                Objects.equals(this.name, inputPort.name) &&
                Objects.equals(this.value, inputPort.value) &&
                Objects.equals(this.type, inputPort.type);
    }

    @Override
    public int hashCode() {

        return Objects.hash(outputPort, index, name,value,type);
    }

    @Override
    public String toString() {
        return "Vstupní port " + this.index;
    }
}
