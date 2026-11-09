#tag Class
Protected Class EvolutionConditionExpression

	#tag Property, Flags = &h0
		#tag Note
			Evaluatable RPN condition expression using evolution variables (e.g. 'EC 100 % 0 ==')
		#tag EndNote
		expression As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Percentage chance of evolution under this condition (0-100)
		#tag EndNote
		percentage_chance As Double
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Evolution variables referenced in the expression
		#tag EndNote
		variables() As OpenAPIClient.Models.EvolutionVariableSummary
	#tag EndProperty





	#tag ViewBehavior
		#tag ViewProperty
			Name="Index"
			Visible=true
			Group="ID"
			InitialValue="-2147483648"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Super"
			Visible=true
			Group="ID"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Left"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Top"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="expression"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="percentage_chance"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="variables"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="EvolutionVariableSummary"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


