import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { N7bPageRoutingModule } from './n7b-routing.module';

import { N7bPage } from './n7b.page';
import { RitornaHomeModule } from 'src/app/components/ritorna-home/ritorna-home.module';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    N7bPageRoutingModule,
    RitornaHomeModule
  ],
  declarations: [N7bPage]
})
export class N7bPageModule {}
