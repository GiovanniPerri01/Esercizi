import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { PalindromaPageRoutingModule } from './palindroma-routing.module';

import { PalindromaPage } from './palindroma.page';
import { RitornaHomeModule } from 'src/app/components/ritorna-home/ritorna-home.module';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    PalindromaPageRoutingModule,
    RitornaHomeModule
  ],
  declarations: [PalindromaPage]
})
export class PalindromaPageModule {}
