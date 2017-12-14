package jsitarski.less.instructions;

/**
 * Created by sitar on 14/12/2017.
 */
public class GetVariableInstruction extends LessInstruction {
    private final String variableName;

    public GetVariableInstruction(final String variableName) {
        this.variableName = variableName;
    }

    @Override
    public int getOpCode() {
        return 0;
    }
}
