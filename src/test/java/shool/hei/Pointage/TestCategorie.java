package shool.hei.Pointage;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCategorie {

    @Test
    public void testCategorieCreation() {
        Categorie categorie = new Categorie("Gardien", 56, 110000);
        assertEquals("Gardien", categorie.getNom());
        assertEquals(56, categorie.getHeuresNormalesParSemaine());
        assertEquals(110000, categorie.getSalaireNormalParSemaine(), 0.01);
    }
}

