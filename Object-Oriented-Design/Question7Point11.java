import java.util.ArrayList;

public class Question7Point11 {
    public static void main(String args[]){

    }
    public class dir{
        ArrayList<folder> folders;
        String name;

        dir(ArrayList<folder>f, String n){
            folders = f;
            name = n;
        }
        public folder accessFolder(String n){
            for (folder f: folders){
                if (f.name==n){
                    return f;
                }
            }
            System.out.println("No folder named that in this directory.");
            return null;
        }
        public void addFolder(String naming){
            folders.add(new folder(new ArrayList<file>(), naming));
        }
        public void deleteFolder(String naming){
            for (folder f: folders){
                if (f.name==naming){
                    folders.remove(f);
                }
            }
            System.out.println("No folder named that in this directory.");
        }

    }
    public class folder{
        ArrayList<file> files;
        String name;

        folder(ArrayList<file>f, String n){
            files = f;
            name = n;
        }
        public file accessFile(String n){
            for (file f: files){
                if (f.name==n){
                    return f;
                }
            }
            System.out.println("No file named that in this folder.");
            return null;
        }
        public void addFile(String naming, String conten){
            files.add(new file(naming));
            files.get(files.size()-1).content = conten;
        }
        public void deleteFile(String naming){
            for (file f: files){
                if (f.name==naming){
                    files.remove(f);
                }
            }
            System.out.println("No file named that in this folder.");
        }
    }

    public class file{
        String content;
        String name;

        file(String n){
            name = n;
        }
        public void addContent(String conten){
            if (conten!=null){
                content = conten+content; }
        }
        public void deleteContent(String conten){
            content = "";
        }
    }
}
