package com.ceceply.learnmaterialx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.ceceply.learnmaterialx.activity.backdrop.BackdropNavigation;
import com.ceceply.learnmaterialx.activity.banner.BannerInfo;
import com.ceceply.learnmaterialx.activity.bottomnavigation.*;
import com.ceceply.learnmaterialx.activity.bottomsheet.*;
import com.ceceply.learnmaterialx.activity.button.*;
import com.ceceply.learnmaterialx.activity.card.*;
import com.ceceply.learnmaterialx.activity.checkradio.*;
import com.ceceply.learnmaterialx.activity.chip.*;
import com.ceceply.learnmaterialx.activity.dialog.*;
import com.ceceply.learnmaterialx.activity.expansionpanel.*;
import com.ceceply.learnmaterialx.activity.form.*;
import com.ceceply.learnmaterialx.activity.gridlist.*;
import com.ceceply.learnmaterialx.activity.list.*;
import com.ceceply.learnmaterialx.activity.menu.*;
import com.ceceply.learnmaterialx.activity.motion.*;
import com.ceceply.learnmaterialx.activity.picker.*;
import com.ceceply.learnmaterialx.activity.progressactivity.*;
import com.ceceply.learnmaterialx.activity.sidesheet.SideSheetBasic;
import com.ceceply.learnmaterialx.activity.slider.*;
import com.ceceply.learnmaterialx.activity.snackbartoast.*;
import com.ceceply.learnmaterialx.activity.stepper.*;
import com.ceceply.learnmaterialx.activity.tabs.*;
import com.ceceply.learnmaterialx.activity.toolbar.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((Button) findViewById(R.id.bottomNavShiftingButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, BottomNavigationShifting.class));
        });

        ((Button) findViewById(R.id.bottomNavBagdeBlinkButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, BottomNavigationBadgeBlink.class));
        });

        ((Button) findViewById(R.id.bottomNavAnimatedButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, BottomNavigationAnimated.class));
        });

        ((Button) findViewById(R.id.bottomSheetFloatingButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, BottomSheetFloating.class));
        });

        ((Button) findViewById(R.id.bottomSheetPlayerButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, BottomSheetPlayer.class));
        });

        ((Button) findViewById(R.id.bottomSheetTransformButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, BottomSheetTransform.class));
        });

        ((Button) findViewById(R.id.sideSheetBasicButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, SideSheetBasic.class));
        });

        ((Button) findViewById(R.id.buttonsBasicButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, ButtonBasic.class));
        });

        ((Button) findViewById(R.id.buttonsFABMoreTextButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, FabMoreText.class));
        });

        ((Button) findViewById(R.id.buttonsMaterialButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, ButtonMaterial.class));
        });

        ((Button) findViewById(R.id.buttonsFABExpandButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, FabExpand.class));
        });

        ((Button) findViewById(R.id.buttonsBackdropNavButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, BackdropNavigation.class));
        });

        ((Button) findViewById(R.id.cardsBasicButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, CardBasic.class));
        });

        ((Button) findViewById(R.id.cardsWizardOverlapButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, CardWizardOverlap.class));
        });

        ((Button) findViewById(R.id.cardsExpandButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, CardExpand.class));
        });

        ((Button) findViewById(R.id.chipsBasicButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, ChipBasic.class));
        });

        ((Button) findViewById(R.id.chipsTagButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, ChipTag.class));
        });

        ((Button) findViewById(R.id.chipsGroupButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, ChipGroup.class));
        });

        ((Button) findViewById(R.id.chipsFilterButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, ChipFilter.class));
        });

        ((Button) findViewById(R.id.checkRadioBasicButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, CheckboxBasic.class));
        });

        ((Button) findViewById(R.id.checkRadioSwitchButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, RadioSwitchBasic.class));
        });

        ((Button) findViewById(R.id.checkRadioParentChildButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, CheckboxParentChild.class));
        });

        ((Button) findViewById(R.id.dialogBasicButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, DialogBasic.class));
        });

        ((Button) findViewById(R.id.dialogCostumButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, DialogCustom.class));
        });

        ((Button) findViewById(R.id.dialogCostumInfoButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, DialogCustomInfo.class));
        });

        ((Button) findViewById(R.id.dialogAddReviewButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, DialogAddReview.class));
        });

        ((Button) findViewById(R.id.dialogGDPRBasicButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, DialogGDPRBasic.class));
        });

        ((Button) findViewById(R.id.dialogHeaderButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, DialogHeader.class));
        });

        ((Button) findViewById(R.id.dialogImageButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, DialogImage.class));
        });

        ((Button) findViewById(R.id.motionCardButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, MotionCard.class));
        });

        ((Button) findViewById(R.id.motionListButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, MotionList.class));
        });

        ((Button) findViewById(R.id.motionFABButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, MotionFab.class));
        });

        ((Button) findViewById(R.id.expansionPanelInvoiceButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, ExpansionPanelInvoice.class));
        });

        ((Button) findViewById(R.id.expansionPanelTicketButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, ExpansionPanelTicket.class));
        });

        ((Button) findViewById(R.id.gridTwoLineButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, GridTwoLine.class));
        });

        ((Button) findViewById(R.id.gridSectionedButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, GridSectioned.class));
        });

        ((Button) findViewById(R.id.listSectionedButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, ListSectioned.class));
        });

        ((Button) findViewById(R.id.listAnimationButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, ListAnimation.class));
        });

        ((Button) findViewById(R.id.listExpandButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, ListExpand.class));
        });

        ((Button) findViewById(R.id.listDragButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, ListDrag.class));
        });

        ((Button) findViewById(R.id.listSwipeButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, ListSwipe.class));
        });

        ((Button) findViewById(R.id.listMultiSelectionButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, ListMultiSelection.class));
        });

        ((Button) findViewById(R.id.menuDrawerMailButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, MenuDrawerMail.class));
        });

        ((Button) findViewById(R.id.menuDrawerSimpleLightButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, MenuDrawerSimpleLight.class));
        });

        ((Button) findViewById(R.id.menuDrawerFilterButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, MenuDrawerFilter.class));
        });

        ((Button) findViewById(R.id.menuDrawerAdminButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, MenuDrawerAdmin.class));
        });

        ((Button) findViewById(R.id.menuDrawerBottomButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, MenuDrawerBottom.class));
        });

        ((Button) findViewById(R.id.menuDrawerSliderSimpleButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, MenuDrawerSliderSimple.class));
        });

        ((Button) findViewById(R.id.menuDrawerBackButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, MenuDrawerBack.class));
        });

        ((Button) findViewById(R.id.bannerInfoButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, BannerInfo.class));
        });

        ((Button) findViewById(R.id.pickerDateLightButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, PickerDateLight.class));
        });

        ((Button) findViewById(R.id.pickerTimeLightButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, PickerTimeLight.class));
        });

        ((Button) findViewById(R.id.pickerColorButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, PickerColor.class));
        });

        ((Button) findViewById(R.id.pickerLocationButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, PickerLocation.class));
        });

        ((Button) findViewById(R.id.progressBasicButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, ProgressBasic.class));
        });

        ((Button) findViewById(R.id.progressLinearCenterButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, ProgressLinearCenter.class));
        });

        ((Button) findViewById(R.id.progressCircleCenterButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, ProgressCircleCenter.class));
        });

        ((Button) findViewById(R.id.progressOnScrollButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, ProgressOnScroll.class));
        });

        ((Button) findViewById(R.id.progressPullRefreshButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, ProgressPullRefresh.class));
        });

        ((Button) findViewById(R.id.progressDotsBounceButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, ProgressDotsBounce.class));
        });

        ((Button) findViewById(R.id.progressButtonButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, ProgressButton.class));
        });

        ((Button) findViewById(R.id.progressButtonSideButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, ProgressButtonSide.class));
        });

        ((Button) findViewById(R.id.progressButtonPercentButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, ProgressButtonPercent.class));
        });

        ((Button) findViewById(R.id.progressButtonDoneButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, ProgressButtonDone.class));
        });

        ((Button) findViewById(R.id.sliderLightButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, SliderLight.class));
        });

        ((Button) findViewById(R.id.sliderRangeButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, SliderRange.class));
        });

        ((Button) findViewById(R.id.snackbarToastBasicButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, SnackbarToastBasic.class));
        });

        ((Button) findViewById(R.id.toastCostumButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, ToastCustom.class));
        });

        ((Button) findViewById(R.id.snackbarCostumButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, SnackbarCustom.class));
        });

        ((Button) findViewById(R.id.stepperDotsButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, StepperDots.class));
        });

        ((Button) findViewById(R.id.stepperVerticalButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, StepperVertical.class));
        });

        ((Button) findViewById(R.id.stepperWizardLightButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, StepperWizardLight.class));
        });

        ((Button) findViewById(R.id.tabsLightButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, TabsLight.class));
        });

        ((Button) findViewById(R.id.tabsIconButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, TabsIcon.class));
        });

        ((Button) findViewById(R.id.tabsScrollButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, TabsScroll.class));
        });

        ((Button) findViewById(R.id.tabsSimpleGreenButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, TabsSimpleGreen.class));
        });

        ((Button) findViewById(R.id.tabsSimpleTopIndicatorButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, TabsSimpleTopIndicator.class));
        });

        ((Button) findViewById(R.id.formWithIconButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, FormWithIcon.class));
        });

        ((Button) findViewById(R.id.formSignUpCardButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, FormSignupCard.class));
        });

        ((Button) findViewById(R.id.formSignUpImageOutlineButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, FormSignupImageOutline.class));
        });

        ((Button) findViewById(R.id.formMaterialBasicButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, FormMaterialBasic.class));
        });

        ((Button) findViewById(R.id.formMaterialIconButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, FormMaterialIcon.class));
        });

        ((Button) findViewById(R.id.formMaterialPrefixSuffixButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, FormMaterialPrefixSuffix.class));
        });

        ((Button) findViewById(R.id.toolbarCollapseButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, ToolbarCollapse.class));
        });

        ((Button) findViewById(R.id.toolbarCollapsePinButton)).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, ToolbarCollapsePin.class));
        });

    }
}