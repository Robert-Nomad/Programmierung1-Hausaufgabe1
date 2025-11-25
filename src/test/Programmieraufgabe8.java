class Programmieraufgabe8Test {

    void uppercaseChar() {
        assertEquals((char)0, Programmieraufgabe8.uppercaseChar('@'));
        assertEquals('A', Programmieraufgabe8.uppercaseChar('a'));
        assertEquals('Z', Programmieraufgabe8.uppercaseChar('z'));
        assertEquals('A', Programmieraufgabe8.uppercaseChar('A'));
        assertEquals('Z', Programmieraufgabe8.uppercaseChar('Z'));
        assertEquals('C', Programmieraufgabe8.uppercaseChar('c'));
    }
}