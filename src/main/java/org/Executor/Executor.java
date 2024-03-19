package org.Executor;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Executor {

    public static void main(String[] args) {
        int argsLength = args.length;
        String inputPath = args[0];
        String outputPath = null;

        if (argsLength == 2) {
            outputPath = args[1];
        }

    }
}