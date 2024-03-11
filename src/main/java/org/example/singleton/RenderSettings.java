package org.example.singleton;

public class RenderSettings {
    private RenderSettings(){}

    private static RenderSettings instance;

    public static RenderSettings getInstance(){
        if(instance == null){
            instance = new RenderSettings();
        }

        return instance;
    }

    private int width;
    private int height;
    private SizeUnit sizeUnit;
    private Boolean anti_aliasing;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if(width <= 0){
            throw new IllegalArgumentException("Width can't be 0 or negative");
        }
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if(height <= 0){
            throw new IllegalArgumentException("Height can't be 0 or negative");
        }
        this.height = height;
    }

    public SizeUnit getSizeUnit() {
        return sizeUnit;
    }

    public void setSizeUnit(SizeUnit sizeUnit) {
        this.sizeUnit = sizeUnit;
    }

    public Boolean getAnti_aliasing() {
        return anti_aliasing;
    }

    public void setAnti_aliasing(Boolean anti_aliasing) {
        this.anti_aliasing = anti_aliasing;
    }
}

