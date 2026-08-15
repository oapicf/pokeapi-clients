//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/berry_flavor_summary.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/contest_type_name.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'contest_type_detail.g.dart';

/// ContestTypeDetail
///
/// Properties:
/// * [id] 
/// * [name] 
/// * [berryFlavor] 
/// * [names] 
@BuiltValue()
abstract class ContestTypeDetail implements Built<ContestTypeDetail, ContestTypeDetailBuilder> {
  @BuiltValueField(wireName: r'id')
  int get id;

  @BuiltValueField(wireName: r'name')
  String get name;

  @BuiltValueField(wireName: r'berry_flavor')
  BerryFlavorSummary get berryFlavor;

  @BuiltValueField(wireName: r'names')
  BuiltList<ContestTypeName> get names;

  ContestTypeDetail._();

  factory ContestTypeDetail([void updates(ContestTypeDetailBuilder b)]) = _$ContestTypeDetail;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ContestTypeDetailBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ContestTypeDetail> get serializer => _$ContestTypeDetailSerializer();
}

class _$ContestTypeDetailSerializer implements PrimitiveSerializer<ContestTypeDetail> {
  @override
  final Iterable<Type> types = const [ContestTypeDetail, _$ContestTypeDetail];

  @override
  final String wireName = r'ContestTypeDetail';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ContestTypeDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(int),
    );
    yield r'name';
    yield serializers.serialize(
      object.name,
      specifiedType: const FullType(String),
    );
    yield r'berry_flavor';
    yield serializers.serialize(
      object.berryFlavor,
      specifiedType: const FullType(BerryFlavorSummary),
    );
    yield r'names';
    yield serializers.serialize(
      object.names,
      specifiedType: const FullType(BuiltList, [FullType(ContestTypeName)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ContestTypeDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ContestTypeDetailBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.id = valueDes;
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        case r'berry_flavor':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BerryFlavorSummary),
          ) as BerryFlavorSummary;
          result.berryFlavor.replace(valueDes);
          break;
        case r'names':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(ContestTypeName)]),
          ) as BuiltList<ContestTypeName>;
          result.names.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ContestTypeDetail deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ContestTypeDetailBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

