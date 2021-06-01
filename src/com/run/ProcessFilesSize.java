package com.run;

public class ProcessFilesSize {

    public static void main(String[] args) {

    }

    private void processAllFiles(final String allFiles) {
        String[] fl;

        int musicsSize = 0;
        int imagesSize = 0;
        int moviesSize = 0;
        int othersSize = 0;

        String type;

        final String[] files = allFiles.split("\n");

        for (String file : files) {
            fl = file.split(" ");
            type = fl[0].substring(fl[0].lastIndexOf("."));

            if (type.equals(".mp3") || type.equals(".flac") || type.equals(".aac")) {
                musicsSize = musicsSize + getSizeNumber(fl[1]);
            } else if (type.equals(".jpg") || type.equals(".bmp") || type.equals(".gif")) {
                imagesSize = imagesSize + getSizeNumber(fl[1]);
            } else if (type.equals(".mp4") || type.equals(".avi") || type.equals(".mkv")) {
                moviesSize = moviesSize + getSizeNumber(fl[1]);
            } else {
                othersSize = othersSize + getSizeNumber(fl[1]);
            }
        }

        System.out.println("music " + musicsSize + "b" + "\n"
                + "images " + imagesSize + "b" + "\n"
                + "movies " + moviesSize + "b" + "\n"
                + "other " + othersSize + "b" + "\n");
    }

    private static int getSizeNumber(final String size) {
        return Integer.parseInt(size.substring(0, (size.length() - 1)));
    }

    //final String musicSize, final String imagesSize, final String moviesSize, final String othersSize
}
