class Markdown {

    String parse(String markdown) {
        String[] lines = markdown.split("\n");
        StringBuilder result = new StringBuilder();
        boolean activeList = false;

		for (String line : lines) {
            String theLine = parseHeader(line);

            if (theLine == null) {
              theLine = parseListItem(line);
            }

            if (theLine == null) {
                theLine = parseParagraph(line);
            }

            if (theLine != null && theLine.matches("(<li>).*") && !theLine.matches("(<h).*") && !theLine.matches("(<p>).*") && !activeList) {
                activeList = true;
                result.append("<ul>");
                result.append(theLine);
            } else if (theLine != null && !theLine.matches("(<li>).*") && activeList) {
                activeList = false;
                result.append("</ul>");
                result.append(theLine);
            } else if (theLine != null) {
              	result.append(theLine);
            } else {
				result.append("\n");
			}
        }

        if (activeList) {
            result.append("</ul>");
        }

        return result.toString();
    }

    private String parseHeader(String markdown) {
        int count = 0;

        for (int i = 0; i < markdown.length() && markdown.charAt(i) == '#'; i++) {
            count++;
        }

        if (count == 0) { return null; }

        return "<h" + count + ">" + parseSomeSymbols(markdown.substring(count + 1)) + "</h" + count + ">";
    }

    private String parseListItem(String markdown) {
        if (markdown.startsWith("*")) {
            String skipAsterisk = markdown.substring(2);
            String listItemString = parseSomeSymbols(skipAsterisk);
            return "<li>" + listItemString + "</li>";
        }

        return null;
    }

    private String parseParagraph(String markdown) {
        return "<p>" + parseSomeSymbols(markdown) + "</p>";
    }

    private String parseSomeSymbols(String markdown) {

        String lookingFor = "__(.+)__";
        String update = "<strong>$1</strong>";
        String workingOn = markdown.replaceAll(lookingFor, update);

        lookingFor = "_(.+)_";
        update = "<em>$1</em>";
        return workingOn.replaceAll(lookingFor, update);
    }
}
