package org.app.actions;

import org.infra.ManipulationAction;
import org.infra.ManipulationUtil;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class SortAction implements ManipulationAction {

    @Override
    public void manipulate(String inputFile, String outputFile) throws IOException {
        List<String> lines = ManipulationUtil.readLinesFromFile(inputFile);
        Collections.sort(lines);
        ManipulationUtil.writeLinesToFile(outputFile, lines);
    }
}
