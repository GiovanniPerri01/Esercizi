import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { N7bPageRoutingModule } from './n7b-routing.module';

import { N7bPage } from './n7b.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    N7bPageRoutingModule
  ],
  declarations: [N7bPage]
})
export class N7bPageModule {}
