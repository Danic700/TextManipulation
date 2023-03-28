package org.app.actions;

import org.infra.actions.ManipulationAction;
import org.infra.actions.ManipulationUtil;

import java.io.IOException;
import java.util.List;
import java.util.Random;

public class ShuffleAction implements ManipulationAction {

    @Override
    public void manipulate(String inputFile, String outputFile) throws IOException {
        List<String> lines = ManipulationUtil.readLinesFromFile(inputFile);
        //Collections.shuffle(lines);
        shuffleList(lines);
        ManipulationUtil.writeLinesToFile(outputFile, lines);

    }

    public void shuffleList(List<String> list) {
        Random random = new Random();
        for (int i = list.size() - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            String temp = list.get(index);
            list.set(index, list.get(i));
            list.set(i, temp);
        }
    }

}
