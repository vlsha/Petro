package com.teama.applidarcalculator.Controller;

import com.teama.applidarcalculator.View;
import com.teama.applidarcalculator.ViewSwitcher;
import javafx.fxml.FXML;

public class ParameterController {

    //Кнопка переходит на сцену с титульным листом
    @FXML
    protected void onTitleButton(){
        ViewSwitcher.switchTo(View.TITLE);
    }

    //Кнопки переходит на сцену с задачей и литературой
    @FXML
    protected void onTaskAndTeorButton(){
        ViewSwitcher.switchTo(View.TASKANDTEOR);
    }

    //Кнопка переходит на сцену с описаниями параментра
    @FXML
    protected void onParameterButton(){
        ViewSwitcher.switchTo(View.PARAMETER);
    }

    //Кнопка переходит на сцену с вычитаванием лидарного уравнения
    @FXML
    protected void onCalLidarButton(){
        ViewSwitcher.switchTo(View.CALLIDAR);
    }

    @FXML
    protected void onLiterButton(){
        ViewSwitcher.switchTo(View.LITER);
    }

    @FXML
    protected void onPrevPage(){
        ViewSwitcher.switchTo(View.CALLIDAR);
    }
}
