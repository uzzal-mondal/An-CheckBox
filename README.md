CheckBox_Android_Studio

1.Checkbox are 2 type 
# check 
#unchecked.

				XML

2.	First of all I am creating a layout design.

3.	Then first I selected a Text view

4.	I am write  any text go to string.xml file.


5.	Then I select 3 CheckBox.

6.	Create button  with Text.



                             Main

7.	Checkbox, text, button all of take a findview id.

8.	Then listener adding to Button.


9.	I am use to onClickListner method

10.	 I want to showing string Text view that for use to StringBuilder .


11.	Then I am creating StringBuilder object

12.	We know that checkbox by default unchecked.


13.	Now I am check to CheckBox.


                             Important

14.	First of all I want to create a condition and use to if condition.
15.	 First checkbox will checked a method isChecked() – if(milkCb.isChecked)

16.	StringBuilder that is working just byte code showing Text.   –  text show 


17.	Fully showing to Text convert to String.

18.	When a milkCb done checked then text storage in StringBuilder.


19.	Before take a String value where milkCb take a getText with toString() method .

20.	StringBuilder then adding to appeand this  value.   – value thatmeans Stirng variable
     Ex: StringBuilder.appeand(value+” ”+is order);

21.	 textview with setText in stringBuilder
22.	Textview create a setText with show Text 

23. below to code in main activity
   ch1 = findViewById(R.id.check1);
        ch2 = findViewById(R.id.check2);
        ch3 = findViewById(R.id.check3);
        btn = findViewById(R.id.btnSubmit);
        text = findViewById(R.id.textRes);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               StringBuilder stringBuilder = new StringBuilder();
               if (ch1.isChecked()){
                   String value = ch1.getText().toString();
                   stringBuilder.append(value+" is orderd"+"\n");
               }

               if (ch2.isChecked()){
                   String value = ch2.getText().toString();
                   stringBuilder.append(value+" is orderd"+"\n");
               }

               if (ch3.isChecked()){
                  String value =  ch3.getText().toString();
                  stringBuilder.append(value+" is orderd"+"\n");
               }

               text.setText(stringBuilder);

            }
        });

