 @Test
    public void KillOne(){
        Tritype tri = new Tritype();
        assertEquals(2, tri.Triang(5, 5, 3));

    }
    @Test
    public void KillTwo(){
        Tritype tri = new Tritype();
        assertEquals(4, tri.Triang(5, 5, 10));

    }
