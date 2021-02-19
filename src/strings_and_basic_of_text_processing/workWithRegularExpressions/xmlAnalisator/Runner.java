package strings_and_basic_of_text_processing.workWithRegularExpressions.xmlAnalisator;

/* Дана строка, содержащая следующий текст(xml-документ):
<notes>
  <note id = "1">
    <to>Vasia</to>
    <from>Sveta</from>
    <heading>Reminder</heading>
    <body>Call me tomorrow!</body>
  </note>
  <note id = "2">
    <to>Petya</to>
    <from>Masha</from>
    <heading>Important remainder</heading>
    <body/>
  </note>
</notes>
Напишите анализатор,позволяющий последовательно возвращать содержимое узлов
xml-документа и его тип(открывающий тег, закрывающий тег, содержимое тега,
тег без тела). Пользоваться готовымипарсерами XML для решения данной задачи нельзя. */


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Our xml document: \n");

        String xmlDocument = "<notes>\n" +
                "  <note id = \"1\">\n" +
                "    <to>Vasia</to>\n" +
                "    <from>Sveta</from>\n" +
                "    <heading>Reminder</heading>\n" +
                "    <body>Call me tomorrow!</body>\n" +
                "  </note>\n" +
                "  <note id = \"2\">\n" +
                "    <to>Petya</to>\n" +
                "    <from>Masha</from>\n" +
                "    <heading>Important remainder</heading>\n" +
                "    <body/>\n" +
                "  </note>\n" +
                "</notes> ";
        System.out.println(xmlDocument + "\n");
        xmlParse(xmlDocument);

    }

    //Разбираем xml документ по каждой строке.

    static void xmlParse(String xmlDocument) {
        String regex = "<\\/?\\w+.+>?";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(xmlDocument);

        System.out.println("Our analyzer: " + "\n");

        while (matcher.find()) {

            // Находим строку.

            String firstTag = matcher.group();

            // В строке находим открывающий тэг.

            Pattern patternOpeningTag = Pattern.compile("<\\w+>");
            Matcher matcherOpeningTag = patternOpeningTag.matcher(firstTag);

            while (matcherOpeningTag.find()) {
                System.out.print("Opening tag: " + matcherOpeningTag.group() + ", ");
            }

            // В строке находим открывающий тэг с атрибутами.

            Pattern patternOpeningTagWithAttributes = Pattern.compile("<\\w+ .+>");
            Matcher matcherOpeningTagWithAttributes = patternOpeningTagWithAttributes.matcher(firstTag);

            while (matcherOpeningTagWithAttributes.find()) {
                System.out.print("Opening tag with attributes: " + matcherOpeningTagWithAttributes.group() + ", ");
            }

            // В строке находим содержимое тэгов.

            Pattern patternContent = Pattern.compile(">.+<");
            Matcher matcherContent = patternContent.matcher(firstTag);

            while (matcherContent.find()) {
                String content = matcherContent.group();
                String regex2 = "[<>]";
                content = content.replaceAll(regex2, "");

                System.out.print("Content of this tag: " + content + ", ");

            }

            // В строке находим тэг пустого элемента.

            Pattern patternTagOfEmptyElement = Pattern.compile("<\\w+\\s?/>");
            Matcher matcherTagOfEmptyElement = patternTagOfEmptyElement.matcher(firstTag);

            while (matcherTagOfEmptyElement.find()) {

                System.out.print("Tag of empty element: " + matcherTagOfEmptyElement.group() + ". ");
            }

            // В строке находим закрывающий тэг.

            Pattern patternClosingTag = Pattern.compile("<\\/\\w+>");
            Matcher matcherClosingTag = patternClosingTag.matcher(firstTag);

            while (matcherClosingTag.find()) {

                System.out.print("Closing tag: " + matcherClosingTag.group() + ". ");
            }
            System.out.println(" ");
        }
    }
}
