public void getFile() throws IOException, Exception {
    File file = new File("data.txt");
    String data = "";
	
    try {
        Scanner input = new Scanner(file);
        while (input.hasNextLine()) {
            data = input.nextLine();
            listOfData.add(Double.parseDouble(data));
        }
        input.close();
    }catch (FileNotFoundException e){
        e.printStackTrace();
    }
    
    for(double number: listOfData) {
        unsortedTextArea.appendText(Double.toString(number));
        unsortedTextArea.appendText("\n");
    }
    Collections.sort(listOfData);
    
    for(double number: listOfData) {
        sortedTextArea.appendText(Double.toString(number));
        sortedTextArea.appendText("\n");
    }

 createFile();
}

    
    public  void createFile() throws IOException{	
          FileWriter file = new FileWriter("data2.txt");
          PrintWriter outputStream = new PrintWriter(file);
          for(double data:listOfData){ 
              outputStream.println(data);
          }
          outputStream.close();
    }
	
	
	
	
    public void getFile() throws IOException, Exception {
           listOfRecords.clear();
            File file = new File("Scores.txt");
        String[] details = new String[4];
        String account = "";
        try {
            Scanner input = new Scanner(file);
            while (input.hasNextLine()){
               account = input.nextLine();
            
           
             
                ArrayList<String> stringOfRecords = new ArrayList<String>(Arrays.asList(account.trim().split(",")));
 
               for(int i = 0; i<details.length;i++){
                details[i]= stringOfRecords.get(i);  
               }
 
               listOfRecords.add(new Record(details[0],details[1],details[2],Integer.parseInt(details[3])));
            }
            input.close();
        } 
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
       }