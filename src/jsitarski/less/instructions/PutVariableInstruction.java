package jsitarski.less.instructions;

/**
 * Created by sitar on 13/12/2017.
 */
public class PutVariableInstruction extends LessInstruction {

    private String variableName;

    private String value;

    public PutVariableInstruction(String variableName, String value) {
        this.variableName = variableName;
        this.value = value;
    }

    /**
     * Returns the true value when computed at compile time.
     *
     * @return
     */
    public String getValue() {
        return value;
    }

    public String getVariableName() {
        return variableName;
    }

    @Override
    public int getOpCode() {
        return 0;
    }
}
