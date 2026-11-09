//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/version_group_summary.dart';
import 'package:openapi/src/model/machine_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'item_machine.g.dart';

/// ItemMachine
///
/// Properties:
/// * [machine] - The machine that teaches a move from an item.
/// * [versionGroup] - The version group of this specific machine.
@BuiltValue()
abstract class ItemMachine implements Built<ItemMachine, ItemMachineBuilder> {
  /// The machine that teaches a move from an item.
  @BuiltValueField(wireName: r'machine')
  MachineSummary get machine;

  /// The version group of this specific machine.
  @BuiltValueField(wireName: r'version_group')
  VersionGroupSummary get versionGroup;

  ItemMachine._();

  factory ItemMachine([void updates(ItemMachineBuilder b)]) = _$ItemMachine;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ItemMachineBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ItemMachine> get serializer => _$ItemMachineSerializer();
}

class _$ItemMachineSerializer implements PrimitiveSerializer<ItemMachine> {
  @override
  final Iterable<Type> types = const [ItemMachine, _$ItemMachine];

  @override
  final String wireName = r'ItemMachine';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ItemMachine object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'machine';
    yield serializers.serialize(
      object.machine,
      specifiedType: const FullType(MachineSummary),
    );
    yield r'version_group';
    yield serializers.serialize(
      object.versionGroup,
      specifiedType: const FullType(VersionGroupSummary),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ItemMachine object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ItemMachineBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'machine':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(MachineSummary),
          ) as MachineSummary;
          result.machine.replace(valueDes);
          break;
        case r'version_group':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(VersionGroupSummary),
          ) as VersionGroupSummary;
          result.versionGroup.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ItemMachine deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ItemMachineBuilder();
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


