class SqueakyClean {
    static String clean(String identifier) {
        identifier = identifier.replaceAll(" ", "_").replaceAll("\\p{Cc}", "CTRL").replaceAll("[^\\p{L}_-]", "");
        StringBuilder builder = new StringBuilder(identifier);
        while (builder.indexOf("-") != -1) {
            int hyphenIdx = identifier.indexOf("-");
            char nextHyphen = identifier.charAt(hyphenIdx + 1);
            builder.setCharAt(hyphenIdx+1, Character.toUpperCase(nextHyphen));
            builder.deleteCharAt(hyphenIdx);
        }
        return builder.toString().replaceAll("-", "").replaceAll("[α-ω]", "");
    }
}
