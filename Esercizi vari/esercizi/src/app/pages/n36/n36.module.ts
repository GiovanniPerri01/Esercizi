import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { N36PageRoutingModule } from './n36-routing.module';

import { N36Page } from './n36.page';
import { RitornaHomeComponent } from 'src/app/components/ritorna-home/ritorna-home.component';
import { RitornaHomeModule } from 'src/app/components/ritorna-home/ritorna-home.module';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    N36PageRoutingModule,
    RitornaHomeModule
  ],
  declarations: [N36Page]
})
export class N36PageModule {}
