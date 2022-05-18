import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { IonicModule } from '@ionic/angular';
import { RitornaHomeComponent } from './ritorna-home.component';



@NgModule({
  declarations: [RitornaHomeComponent],
  imports: [
    CommonModule,
    RouterModule,
    FormsModule,
    IonicModule
  ],
  exports: [RitornaHomeComponent]
})
export class RitornaHomeModule { }
