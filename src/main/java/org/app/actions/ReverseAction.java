package org.app.actions;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import org.infra.ManipulationAction;
import org.infra.ManipulationUtil;

public class ReverseAction implements ManipulationAction {

    @Override
    public void manipulate(String inputFile, String outputFile) throws IOException {
        List<String> lines = ManipulationUtil.readLinesFromFile(inputFile);
        Collections.reverse(lines);
        ManipulationUtil.writeLinesToFile(outputFile, lines);

    }
}
