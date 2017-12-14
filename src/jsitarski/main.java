package jsitarski;

import com.sun.org.apache.bcel.internal.generic.Instruction;
import jsitarski.datastructures.trees.AbstractSyntaxTree;

/**
 * Created by sitar on 13/12/2017.
 */
public class main {

    public static void main(String[] $a) {
        final String variableAssignment = "@backgroundColor: #ab11ed;";
        // basic less file to test.
        final String sampleLessFile = "@backgroundColor1: #ab11ed; \n.noteBox{\n\tcolor:@base;\n}";
        System.out.println(sampleLessFile);
        final AbstractSyntaxTree<Instruction> ast = new AbstractSyntaxTree<>(null);


    }
}
