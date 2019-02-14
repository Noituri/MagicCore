package dreavedir.magiccore.chapters;

public class Chapters implements IChapters {
    private int currentChapter = 0;

    @Override
    public void setCurrentChapter(int currentChapter) {
        this.currentChapter = currentChapter;
    }

    @Override
    public int getCurrentChapter() {
        return currentChapter;
    }
}
