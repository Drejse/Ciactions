package ci;

public class MyFunctionality {

    public MyFunctionality() {
    }
    
    public int getTen(){
        return 10;
    }
  }


name: Java CI

on: [push]

jobs:
  build:
    runs-on: ubuntu-latest

    steps:
      - uses: actions/checkout@v2
      - name: Set up JDK 11
        uses: actions/setup-java@v2
        with:
          java-version: '11'
          distribution: 'adopt'
      - name: Build with Maven
        run: mvn --batch-mode --update-snapshots verify