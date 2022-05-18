import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { N14PageRoutingModule } from './n14-routing.module';

import { N14Page } from './n14.page';
import { RitornaHomeComponent } from 'src/app/components/ritorna-home/ritorna-home.component';
import { AppModule } from 'src/app/app.module';
import { RitornaHomeModule } from 'src/app/components/ritorna-home/ritorna-home.module';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    N14PageRoutingModule,
    RitornaHomeModule
  ],
  declarations: [N14Page]
})
export class N14PageModule {}
