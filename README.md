# SectionRecyclerView
A Section Recyclerview supports section header and section footer

This customized recyclerview adapter takes Groups of section data set and automatically rearrange the data to display sections in recyclerview.

# Three steps: How to use:
1. define your data sturcture, basic data, and sectioned data that contains basic data. Then put them into a list.
2. extends **SectionedRecycerAdapter** and implements all the abstract method
3. set up recyeclerview with the adapter. and that's it.

## Data Structure ##
It is easier to manage data in a way that is object-oriented, and it is especially true put involves data inside an adapter. In the case of Sectioned Recyclerview, you are technocially needs is to separated datas in groups, and perhaps with headers and footer to distingush one group from another in a recyclerview's adapter.  

So the first thing is to define data structure that is object-oriented: **Basic Data** -- **section data**  --- **createing list**

1. define **POJO** to represent the smallest data in the adapter: each item representation in the adatper: For example: if you means to show a text and a image inside a single cell of a adapter visually, you need to create a plain java class that has a field representing text and a field that representing image.
2. After we are done with basic data, we need to create data container that representing section, or group.
