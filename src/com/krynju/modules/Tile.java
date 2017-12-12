package com.krynju.modules;

public class Tile {
    public boolean destroyable = false;
    private Wall wall;
    private int x, y;
    private boolean wallOnTile = false;
    private boolean bombed = false;
    private boolean playerOnTile = false;
    private boolean enemyOnTile = false;
    private boolean bombDanger = false;
    private boolean twoBombDanger = false;

    public Tile(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isTwoBombDanger() {
        return twoBombDanger;
    }

    public void setTwoBombDanger(boolean twoBombDanger) {
        this.twoBombDanger = twoBombDanger;
    }

    public Wall getWall() {
        return wall;
    }

    public void setWall(Wall wall) {
        this.wall = wall;
    }

    public boolean isPlayerOnTile() {
        return playerOnTile;
    }

    public void setPlayerOnTile(boolean playerOnTile) {
        this.playerOnTile = playerOnTile;
    }

    public boolean isBombed() {
        return bombed;
    }

    public void setBombed(boolean bombed) {
        this.bombed = bombed;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isWallOnTile() {
        return wallOnTile;
    }

    public void setWallOnTile(boolean wallOnTile) {
        this.wallOnTile = wallOnTile;
    }

    public boolean isBombDanger() {
        return bombDanger;
    }

    public void setBombDanger(boolean bombDanger) {
        this.bombDanger = bombDanger;
    }

    public boolean isEnemyOnTile() {
        return enemyOnTile;
    }

    public void setEnemyOnTile(boolean enemyOnTile) {
        this.enemyOnTile = enemyOnTile;
    }
}
