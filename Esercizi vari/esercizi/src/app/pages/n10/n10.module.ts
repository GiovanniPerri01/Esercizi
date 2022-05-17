import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { N10PageRoutingModule } from './n10-routing.module';

import { N10Page } from './n10.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    N10PageRoutingModule
  ],
  declarations: [N10Page]
})
export class N10PageModule {}
