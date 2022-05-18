import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { N32PageRoutingModule } from './n32-routing.module';

import { N32Page } from './n32.page';
import { RitornaHomeModule } from 'src/app/components/ritorna-home/ritorna-home.module';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    N32PageRoutingModule,
    RitornaHomeModule
  ],
  declarations: [N32Page]
})
export class N32PageModule {}
