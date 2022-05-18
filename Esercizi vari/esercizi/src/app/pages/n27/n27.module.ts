import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { N27PageRoutingModule } from './n27-routing.module';

import { N27Page } from './n27.page';
import { RitornaHomeModule } from 'src/app/components/ritorna-home/ritorna-home.module';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    N27PageRoutingModule,
    RitornaHomeModule
  ],
  declarations: [N27Page]
})
export class N27PageModule {}
