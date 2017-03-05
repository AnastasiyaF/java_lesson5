/*
 * На основании суммы оценок, сортируем массив по убыванию суммы оценок.
 * Используется алгоритм quick sort:
 * 
 * getSum_rates - сумма оценок по предмету 1 абитуриента.
 * pivot - пивот элемент, 
 */

package com.epam.java_training.task2;


public class QuickSort {
	private Record[] records;
	private int count_records;
	private int filter_type;

	public QuickSort(Record[] record_massive, int filter_type) {
        
        this.records = record_massive;
        this.filter_type = filter_type;
        this.count_records = record_massive.length;
	}
	
	public void runSort(){
		sort( 0, this.count_records - 1);
	}
	
	public Record[] getRecords(){
		return this.records;
	}
	
	public int getFilter_type(){
		return this.filter_type;
	}
	
	public void setFilter_type(int filter_type){
		this.filter_type = filter_type;
	}


	private void sort(int low_position, int high_position) {
        int i = low_position;
        int	j = high_position;
        
        Record pivot;
        Record temp_record;
        
        pivot = records[low_position + (high_position - low_position)/2];

        while (i <= j) {

        	while (this.records[i].filterFields(this.filter_type).compareTo(pivot.filterFields(this.filter_type)) < 0) {
        		i++;
            }
            
        	while (this.records[j].filterFields(this.filter_type).compareTo(pivot.filterFields(this.filter_type)) > 0) {
            	j--;
            }

            if (i <= j) {
            	temp_record = records[i];
            	records[i] = records[j];
            	records[j] = temp_record;
                
                i++;
                j--;
            }
        }

        if (low_position < j)
        	sort(low_position, j);
        if (i < high_position)
        	sort(i, high_position);
	}
	
}
