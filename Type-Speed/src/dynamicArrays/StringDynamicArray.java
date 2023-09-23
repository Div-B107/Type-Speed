package dynamicArrays;

public class StringDynamicArray {

    public String[] strings; // burada    Person[] persons = new Persone[0]da deye bilerem yada constructorda initalize ede bilerem men constructorla initalize edecem

    public StringDynamicArray() {
        strings = new String[0];//ilk basda uzunluq vermirem daha sonra elave edecem çünki
    }


    public void add(String cls) {
        String[] newClases = new String[strings.length + 1];

        for (int i = 0; i < strings.length; i++) {
            newClases[i] = strings[i];
        }
        newClases[strings.length] = cls;//burada -1 yazmisam sehv olub

        strings = newClases;

    }

    public void delete(int index) throws IllegalArgumentException {
        if (index < 0 || index >= strings.length) {
            throw new IllegalArgumentException("Out of index");
        }
        String[] newArray = new String[strings.length - 1];

        for (int i = 0, k = 0; i < strings.length; i++) {
            if (i == index) {
                continue;
            }

            newArray[k++] = strings[i];


        }
        strings = newArray;


    } //get methodunu yazaq

    public String get(int index) {
        if (index < 0 || index >= strings.length) {
            throw new IllegalArgumentException();
        }
        return strings[index];

    }

    public int getSize() {

        return strings.length;
    }

}
