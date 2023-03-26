package org.infra;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReverseAction implements ManipulationAction{

    @Override
    public void manipulate(File inputFile, File outputFile) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

        try {
            List<String> lines = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            for (int i = lines.size() - 1; i >= 0; i--) {
                writer.write(lines.get(i));
                writer.newLine();
            }
        } finally {
            reader.close();
            writer.close();
        }

    }
}
