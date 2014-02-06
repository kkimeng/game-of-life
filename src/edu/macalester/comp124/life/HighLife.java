package edu.macalester.comp124.life;

/**
 * Created by Kim eng on 2/6/14.
 */
public class HighLife implements RuleSet {
    public String getName() {
        return "HighLife's Rules";
    }

    /**
     * Applies the rules of Conway's Game of Life.
     *
     * @param isAlive       The value of the current cell (true = alive).
     * @param neighborCount The number of living neighbors of the cell.
     * @return true if the cell should be alive in the next generation.
     */
    public boolean applyRules(boolean isAlive, int neighborCount) {

        if (isAlive == true && (neighborCount < 2 || neighborCount > 3)) {
            return false;
        }
        if (isAlive == false && (neighborCount == 3 || neighborCount == 6)) {
            return true;
        }
        return isAlive;
    }
}
