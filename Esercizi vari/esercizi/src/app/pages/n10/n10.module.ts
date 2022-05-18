import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { N10PageRoutingModule } from './n10-routing.module';

import { N10Page } from './n10.page';
import { RitornaHomeModule } from 'src/app/components/ritorna-home/ritorna-home.module';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    N10PageRoutingModule,
    RitornaHomeModule
  ],
  declarations: [N10Page]
})
export class N10PageModule {}
