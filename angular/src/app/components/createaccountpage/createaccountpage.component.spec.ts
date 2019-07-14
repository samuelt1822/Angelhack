import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CreateaccountpageComponent } from './createaccountpage.component';

describe('CreateaccountpageComponent', () => {
  let component: CreateaccountpageComponent;
  let fixture: ComponentFixture<CreateaccountpageComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CreateaccountpageComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CreateaccountpageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
