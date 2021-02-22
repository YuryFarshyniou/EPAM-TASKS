package basic_of_oop.basic_of_oop_1.by.yurachel.basic_of_oop1.entity;

public abstract class File {
    private String fileName;
    private int size;
    private Directory directory;
    private boolean isAvailable;

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String getFileName() {
        if (!isAvailable) {
            return "File has been deleted.";
        } else {
            return fileName;
        }
    }


    public void setFileName(String fileName) {
        this.fileName = fileName;
    }


    public int getSize() {
        if (!isAvailable) {
            System.out.println("File has been deleted.");
        } else {
            return size;
        }
        return -1;
    }

    public void setSize(int size) {
        this.size = size;
    }


    public Directory getDirectory() {
        if (!isAvailable) {
            System.out.println("File has been deleted.");
        } else {
            return directory;
        }
        return null;
    }

    public void setDirectory(Directory directory) {
        this.directory = directory;
    }

    // Создаем новый файл.

    public File(String fileName, int size, Directory directory, boolean isAvailable) {
        this.fileName = fileName;
        this.size = size;
        this.directory = directory;
        this.isAvailable = isAvailable;
    }

    // Переименовываем файл.

    public void rename(String newFileName) {
        this.fileName = newFileName;
    }

    // Удаляем файл.

    public void delete() {
        this.isAvailable = false;
    }
}
