#tag Class
Protected Class MoveComboUsage

	#tag Property, Flags = &h0
		#tag Note
			A list of moves to use before this move.
		#tag EndNote
		use_before() As OpenAPIClient.Models.MoveSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of moves to use after this move.
		#tag EndNote
		use_after() As OpenAPIClient.Models.MoveSummary
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
			Name="use_before"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="MoveSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="use_after"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="MoveSummary"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


