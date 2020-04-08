package com.gildedrose;

class GildedRose {
    private static final String BRIE = "Aged Brie";
    private static final String PASS = "Backstage passes to a TAFKAL80ETC concert";
    private static final String SULFURAS = "Sulfuras, Hand of Ragnaros";

    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            Item currentItem = items[i];
            String itemName = currentItem.name;
            Boolean brie = itemName.equals(BRIE);
            Boolean pass = itemName.equals(PASS);
            Boolean sulfuras = itemName.equals(SULFURAS);
            Boolean noSulfuras = !sulfuras;

            if (brie || pass) {
                qualityMinor50(currentItem, pass);
            } else {
                qualityMinor0(currentItem, noSulfuras);
            }

            if (noSulfuras) {
                minusSellIn(currentItem);
            }

            minorSellIn(currentItem, brie, pass, noSulfuras);
        }
    }

    /** Operaciones básicas con currentItem.quality para incrementar, decrementar o igualar a 0.
     *
     *  @param currentItem
     */
    private void plusQuality(Item currentItem) { currentItem.quality++; }
    private void minusQuality(Item currentItem) { currentItem.quality--; }
    private void zeroQuality(Item currentItem) { currentItem.quality = 0; }

    /** Función un poco más compleja, primero incrementa en uno currentItem y, si cumple pass, llama al método
     *  minorSellIn.
     *
     *  @param currentItem
     *  @param pass
     */
    private void qualityPass(Item currentItem, Boolean pass) {
        plusQuality(currentItem);

        if (pass) {
            minorSellIn(currentItem, 11);
            minorSellIn(currentItem, 6);
        }
    }

    /** Si currentItem > 0 y cumple noSulfuras, decrementa en uno a currentItem.
     *
     *  @param currentItem
     *  @param noSulfuras
     */
    private void qualityMinor0(Item currentItem, Boolean noSulfuras) {
        if (currentItem.quality > 0 && noSulfuras) {
            minusQuality(currentItem);
        }
    }

    /** Función lógica que calcula currentItem++ si currentItem es menor que 50.
     *
     *  @param currentItem
     */
    private void qualityMinor50(Item currentItem) {
        if (currentItem.quality < 50) {
            plusQuality(currentItem);
        }
    }

    /** Función lógica que calcula que llama al método qualityPass si currentItem es menor que 50.
     *
     *  @param currentItem
     *  @param pass
     */
    private void qualityMinor50(Item currentItem, boolean pass) {
        if (currentItem.quality < 50) {
            qualityPass(currentItem, pass);
        }
    }

    /** Operación básica para decrementar currentItem.SellIn en uno.
     *
     *  @param currentItem
     */
    private void minusSellIn(Item currentItem) { currentItem.sellIn--; }

    /** Si currentItem es menor que el día actual (num), llama al método qualityMinor50.
     *
     *  @param currentItem
     *  @param num
     */
    private void minorSellIn(Item currentItem, int num) {
        if (currentItem.sellIn < num) {
            qualityMinor50(currentItem);
        }
    }

    /** Es la función más compleja. Si currentItem es menor que cero, dependiendo de brie, pass y noSulfuras puede
     *  ocurrir cualquier operación con currentItem.
     *
     *  @param currentItem
     *  @param brie
     *  @param pass
     *  @param noSulfuras
     */
    private void minorSellIn(Item currentItem, Boolean brie, Boolean pass, Boolean noSulfuras) {
        if (currentItem.sellIn < 0) {
            if (brie) {
                qualityMinor50(currentItem);
            } else if (pass) {
                zeroQuality(currentItem);
            } else {
                qualityMinor0(currentItem, noSulfuras);
            }
        }
    }

}