import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { StringheConcatenatePageRoutingModule } from './stringhe-concatenate-routing.module';

import { StringheConcatenatePage } from './stringhe-concatenate.page';
import { RitornaHomeModule } from 'src/app/components/ritorna-home/ritorna-home.module';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    StringheConcatenatePageRoutingModule,
    RitornaHomeModule
  ],
  declarations: [StringheConcatenatePage]
})
export class StringheConcatenatePageModule {}
