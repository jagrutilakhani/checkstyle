package com.puppycrawl.tools.checkstyle.checks.indentation.indentation;  //indent:0 exp:0

/**                                                                           //indent:0 exp:0
 * This test-input is intended to be checked using following configuration:   //indent:1 exp:1
 *                                                                            //indent:1 exp:1
 * arrayInitIndent = 4                                                        //indent:1 exp:1
 * basicOffset = 4                                                            //indent:1 exp:1
 * braceAdjustment = 0                                                        //indent:1 exp:1
 * caseIndent = 4                                                             //indent:1 exp:1
 * forceStrictCondition = false                                               //indent:1 exp:1
 * lineWrappingIndentation = 4                                                //indent:1 exp:1
 * tabWidth = 4                                                               //indent:1 exp:1
 * throwsIndent = 4                                                           //indent:1 exp:1
 *                                                                            //indent:1 exp:1
 *                                                                            //indent:1 exp:1
 */                                                                           //indent:1 exp:1
public class InputIndentationNestedMethodCall { //indent:0 exp:0

    public static void main(String[] args) { //indent:4 exp:4
        firstMethod( //indent:8 exp:8
                secondMethod( //indent:16 exp:16
                        "string" //indent:24 exp:24
                ) //indent:16 exp:16
        ); //indent:8 exp:8

        firstMethod( //indent:8 exp:8
              secondMethod( //indent:14 exp:16 warn
                      "string" //indent:22 exp:24 warn
              ) //indent:14 exp:16 warn
        ); //indent:8 exp:8
    } //indent:4 exp:4

    private static void firstMethod(String string) { //indent:4 exp:4
        return; //indent:8 exp:8
    } //indent:4 exp:4

    private static String secondMethod(String string) { //indent:4 exp:4
        return string + "2"; //indent:8 exp:8
    } //indent:4 exp:4
} //indent:0 exp:0
